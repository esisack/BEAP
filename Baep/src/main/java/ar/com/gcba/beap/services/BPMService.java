package ar.com.gcba.beap.services;

import java.util.Map;

import org.kie.server.api.model.instance.ProcessInstance;
import org.kie.server.api.model.instance.TaskInstance;
import org.kie.server.client.KieServicesClient;
import org.kie.server.client.KieServicesFactory;
import org.kie.server.client.ProcessServicesClient;
import org.kie.server.client.UIServicesClient;
import org.kie.server.client.UserTaskServicesClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class BPMService {

	@Value( "${jbpm.url}" )
	private String serverUrl;
	
	@Value( "${jbpm.container}" )
	private String container;
	
	@Value( "${jbpm.process}" )
	private String process;
	
	private String SERVER_URL = "http://localhost:8080/kie-server/services/rest/server";
//	private String CONTAINER_ID = "oficios-bpm_1.0.0-SNAPSHOT";

	private UserTaskServicesClient taskService;
	private ProcessServicesClient processService;
	private UIServicesClient uiService;
	private String userName;

	public BPMService() {
		KieServicesClient client = KieServicesFactory.newKieServicesRestClient(SERVER_URL, "wbadmin", "wbadmin");
		this.taskService = client.getServicesClient(UserTaskServicesClient.class);
		this.processService = client.getServicesClient(ProcessServicesClient.class);
		this.uiService = client.getServicesClient(UIServicesClient.class);
	}

	public Long startNewInstance(String containerId, String processId, Map<String, Object> parameters) {
		return this.processService.startProcess(containerId, processId, parameters);
	}

	public ProcessInstance getProcessInstance(String containerId, long pId) {
		return this.processService.getProcessInstance(containerId, pId, true);
	}

	public void doTask(String containerId, long taskId) {
		this.taskService.claimTask(containerId, taskId, "wbadmin");
		this.taskService.startTask(containerId, taskId, "wbadmin");
		this.taskService.completeTask(containerId, taskId, "wbadmin", null);
	}

	public void doTask(String containerId, long taskId, Map<String, Object> params) {
		TaskInstance task = this.taskService.getTaskInstance(containerId, taskId, false, false, true);

		// Claim si aun no esta tomada por el usuario
		if (task.getActualOwner() == null) {
			this.taskService.claimTask(containerId, taskId, "wbadmin");
		}

		if (task.getActualOwner() == "wbadmin") {
			this.taskService.startTask(containerId, taskId, "wbadmin");
			this.taskService.completeTask(containerId, taskId, "wbadmin", params);
		}
	}

	public Map<String, Object> getProcessVariables(String containerId, long piid) {
		return this.processService.getProcessInstanceVariables(containerId, piid);
	}

	public TaskInstance getTask(String containerId, long piid) {
		return this.taskService.getTaskInstance(containerId, piid);
	}

	public String getProcessInstanceImage(String containerId, Long processInstanceId) {
		return this.uiService.getProcessInstanceImage(containerId, processInstanceId);
	}

	public UserTaskServicesClient getTaskService() {
		return taskService;
	}

	public void setTaskService(UserTaskServicesClient taskService) {
		this.taskService = taskService;
	}

	public ProcessServicesClient getProcessService() {
		return processService;
	}

	public void setProcessService(ProcessServicesClient processService) {
		this.processService = processService;
	}

	public UIServicesClient getUiService() {
		return uiService;
	}

	public void setUiService(UIServicesClient uiService) {
		this.uiService = uiService;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}

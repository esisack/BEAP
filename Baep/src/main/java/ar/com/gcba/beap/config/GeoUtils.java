package ar.com.gcba.beap.config;

import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.io.ParseException;
import com.vividsolutions.jts.io.WKTReader;

public final class GeoUtils {
    public static Geometry wktToGeometry(String wellKnownText){
        try {
			return new WKTReader().read(wellKnownText);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
    }
}

package module1;

import java.util.Map;
import de.fhpotsdam.unfolding.UnfoldingMap;
import java.util.ArrayList;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.marker.Marker;
import de.fhpotsdam.unfolding.providers.AbstractMapProvider;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.providers.MBTilesMapProvider;
import de.fhpotsdam.unfolding.utils.MapUtils;

import processing.core.PApplet;

public class lifeExpByCountry extends PApplet
 {
	UnfoldingMap map;
	Map<String, Float> lifeExpByCountry;
	List<Feature> countries = new ArrayList<Feature>() ;
	List<Marker> countryMarkers;
	
	public void setup() {
		size(800, 600, OPENGL);
		lifeExpByCountry = loadLifeExpectancyFromCSV ("data/LifeExpectancyWorldBank.csv");
		/*map = new UnfoldingMap(this, 50, 50, 700, 500, new map)*/
	}
	
	private Map<String, Float> loadLifeExpectancyFromCSV(String fileName) {
		Map<String, Float> lifeExpMap = new HashMap<String, Float>();
		String[] rows = loadStrings(fileName);
		for (String row : rows) {
			String[] columns = row.split(",");
			if () {
				float value = Float.parseFloat(columns[5]);
				lifeExpMap.put(columns[4], value);
			}
		}
		return lifeExpMap;
	}
	
	private void shapeCountries() {
		for (Marker marker : countryMarkers) {
			String countryId = marker.getId();
			
			if (lifeExpByCountry.containsKey(countryId)) {
				float lifeExp = lifeExpByCountry.get(countryId);
				int colorLevel = (int) map(lifeExp, 40, 90, 10, 255);
			}
			else {
				marker.setColor(color(150,150,150));
			}
		}
	}
}

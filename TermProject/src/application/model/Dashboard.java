package application.model;

import java.util.HashMap;

public class Dashboard {

	private static Dashboard instance;

	private String name;

    static HashMap<String, Integer> xmap = new HashMap<String, Integer>();
    static HashMap<String, Integer> ymap = new HashMap<String, Integer>();
    static HashMap<String, Integer> wmap = new HashMap<String, Integer>();
    static HashMap<String, Integer> hmap = new HashMap<String, Integer>();

	private Dashboard() {
	}

	public static Dashboard getInstance() {
		if (instance == null) {
			instance = new Dashboard();
			intMap();
		}
		return instance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getXValue(String name) {
		Integer x =  (Integer) xmap.get(name);
		return x;
	}

	public Integer getYValue(String name) {
		Integer y =  (Integer) ymap.get(name);
		return y;
	}

	public Integer getWValue(String name) {
		Integer y =  (Integer) wmap.get(name);
		return y;
	}

	public Integer getHValue(String name) {
		Integer y =  (Integer) hmap.get(name);
		return y;
	}


	private static void intMap() {
		xmap.put("barn", 60);
		ymap.put("barn", 100);
		wmap.put("barn", 150);
		hmap.put("barn", 125);

		xmap.put("cow", 80);
		ymap.put("cow", 120);
		wmap.put("cow", 50);
		hmap.put("cow", 50);

		xmap.put("storage building", 600);
		ymap.put("storage building", 100);
		wmap.put("storage building", 200);
		hmap.put("storage building", 250);

		xmap.put("tractor", 650);
		ymap.put("tractor", 120);
		wmap.put("tractor", 50);
		hmap.put("tractor", 50);

		xmap.put("tiller", 650);
		ymap.put("tiller", 200);
		wmap.put("tiller", 30);
		hmap.put("tiller", 30);

		xmap.put("Corp Field", 300);
		ymap.put("Corp Field", 500);
		wmap.put("Corp Field", 500);
		hmap.put("Corp Field", 280);

		xmap.put("Soy Corp", 200);
		ymap.put("Soy Corp", 500);
		wmap.put("Soy Corp", 100);
		hmap.put("Soy Corp", 280);

		xmap.put("Command center", 420);
		ymap.put("Command center", 0);
		wmap.put("Command center", 120);
		hmap.put("Command center", 50);

		xmap.put("drone", 420);
		ymap.put("drone", 0);
		wmap.put("drone", 120);
		hmap.put("drone", 50);

	}


}

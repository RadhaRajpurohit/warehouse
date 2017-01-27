public class Warehouse {
	private int warehouse_id;
	private String warehouse_location_name;
	private String city;
	private String Zone;
	private String Aisle;
	private String Bay;
	private String level;
	private String bin;
	private String type_of_zone;
	public Warehouse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Warehouse(int warehouse_id, String warehouse_location_name, String city, String zone, String aisle,
			String bay, String level, String bin, String type_of_zone) {
		super();
		this.warehouse_id = warehouse_id;
		this.warehouse_location_name = warehouse_location_name;
		this.city = city;
		Zone = zone;
		Aisle = aisle;
		Bay = bay;
		this.level = level;
		this.bin = bin;
		this.type_of_zone = type_of_zone;
	}
	public int getWarehouse_id() {
		return warehouse_id;
	}
	public void setWarehouse_id(int warehouse_id) {
		this.warehouse_id = warehouse_id;
	}
	public String getWarehouse_location_name() {
		return warehouse_location_name;
	}
	public void setWarehouse_location_name(String warehouse_location_name) {
		this.warehouse_location_name = warehouse_location_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZone() {
		return Zone;
	}
	public void setZone(String zone) {
		Zone = zone;
	}
	public String getAisle() {
		return Aisle;
	}
	public void setAisle(String aisle) {
		Aisle = aisle;
	}
	public String getBay() {
		return Bay;
	}
	public void setBay(String bay) {
		Bay = bay;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getBin() {
		return bin;
	}
	public void setBin(String bin) {
		this.bin = bin;
	}
	public String getType_of_zone() {
		return type_of_zone;
	}
	public void setType_of_zone(String type_of_zone) {
		this.type_of_zone = type_of_zone;
	}
	@Override
	public String toString() {
		return "Warehouse [warehouse_id=" + warehouse_id + ", warehouse_location_name=" + warehouse_location_name
				+ ", city=" + city + ", Zone=" + Zone + ", Aisle=" + Aisle + ", Bay=" + Bay + ", level=" + level
				+ ", bin=" + bin + ", type_of_zone=" + type_of_zone + "]";
	}
	

}
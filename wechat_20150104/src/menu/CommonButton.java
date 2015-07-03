package menu;

/*
 * 没有子菜单，可以是二级菜单，也可以是没有子菜单的一级菜单*/
public class CommonButton extends Button {
	private String type;
	private String key;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
}

package ioc;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionInjection {
	
	public Set<String> AllSet;
	public List<String> AllList;
	public Map<String,String> AllMap;
	public Set<String> getAllSet() {
		return AllSet;
	}
	public void setAllSet(Set<String> allSet) {
		AllSet = allSet;
	}
	public List<String> getAllList() {
		return AllList;
	}
	public void setAllList(List<String> allList) {
		AllList = allList;
	}
	public Map<String, String> getAllMap() {
		return AllMap;
	}
	public void setAllMap(Map<String, String> allMap) {
		AllMap = allMap;
	}
	@Override
	public String toString() {
		return "CollectionInjection [AllSet=" + AllSet + ", AllList=" + AllList + ", AllMap=" + AllMap + "]";
	}
	
	
	

}

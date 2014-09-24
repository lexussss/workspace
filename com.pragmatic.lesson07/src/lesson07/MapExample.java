package lesson07;
 
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
 
public class MapExample {
	public static void main(String[] args) {
		try {
 
			Map mMap = new HashMap();
			mMap.put("PostgreSQL", "Free Open Source Enterprise Database");
			mMap.put("DB2", "Enterprise Database , It's expensive");
			mMap.put("Oracle", "Enterprise Database , It's expensive");
			mMap.put("MySQL", "Free Open SourceDatabase");
 
			Iterator iterForKeySet = mMap.keySet().iterator();
			
			int i=0;
			
			while (iterForKeySet.hasNext()){
				System.out.println("Printing key["+ i +"]: " + iterForKeySet.next()); 
				i++;
			}
			
			
			//entrySet() - Returns a Set view of the mappings contained in this map. 
			//The set is backed by the map, so changes to the map are reflected in the set, and vice-versa.
			//If the map is modified while an iteration over the set is in progress 
			//(except through the iterator's own remove operation, or through the setValue operation on a map entry returned by the iterator) 
			//the results of the iteration are undefined
			Iterator iter = mMap.entrySet().iterator();
 
			while (iter.hasNext()) {
				Map.Entry mEntry = (Map.Entry) iter.next();
				System.out.println(mEntry.getKey() + " : " + mEntry.getValue());
			}
 
			mMap.put("Oracle", "Enterprise Database , It's free now ! (hope)");
 
			System.out.println("One day Oracle.. : " + mMap.get("Oracle"));
 
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
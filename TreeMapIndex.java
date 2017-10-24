import java.util.*;

public class TreeMapIndex<K, V> implements Index {

    private TreeMap<String, List<Website>> map = null;

   // public TreeMapIndex(){
        //map = new TreeMap<String, List<Website>>();
   // }

   public void TreeMapIndex() {
        TreeMap<String, List<Website>> map = new TreeMap<String, List<Website>>();
   }

    @Override
    public void build(List<Website> sites) throws NullPointerException {
        List<String> words = new ArrayList<>();
        for (Website site : sites) {
            words = site.getWords();
            for (String word : words) {
                ArrayList<Website> foundSites = new ArrayList<>();
                for (Website w : sites) {
                    if (w.containsWord(word)) {
                        foundSites.add(w);
                    //   map.put(word, foundSites);
                    } else if(w.containsWord(word)==null){
                        throw new NullPointerException("value is null");
                    }
                }
            }

        }
    }


    public List<Website> lookup(String query) {
        if(map.get(query)!=null){
            List emptyList = new ArrayList();
            return emptyList;
        }
        else {
            //return map.get(query);
            throw new NullPointerException("value is null");
        }
    }


}

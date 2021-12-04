import java.util.*;

public class Logic {
    public static void main(String[] args) {
        Trees apple1 = new Apple("семиренко");
        Trees apple2 = new Apple("село");
        Trees apple3 = new Apple("мороша");

        Trees cherry1 = new Cherry("белая");
        Trees cherry2 = new Cherry("красная");
        Trees cherry3 = new Cherry("зеленая");

        Trees pears1 = new Pears("большая");
        Trees pears2 = new Pears("маленькая");
        Trees pears3 = new Pears("твердая");

        Set<Trees> appleSet = new HashSet<>();
        appleSet.add(apple1);
        appleSet.add(apple2);
        appleSet.add(apple3);

        Set<Trees> cherrySet = new HashSet<>();
        cherrySet.add(cherry1);
        cherrySet.add(cherry2);
        cherrySet.add(cherry3);

        Set<Trees> pearsSet = new HashSet<>();
        pearsSet.add(pears1);
        pearsSet.add(pears2);
        pearsSet.add(pears3);

        HashMap<String, Set<Trees>> map = new HashMap<>();
        map.put("Яблоки", appleSet);
        map.put("Вишни", cherrySet);
        map.put("Груша", pearsSet);

        Set<Map.Entry<String, Set<Trees>>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Set<Trees>>> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry<String, Set<Trees>> entry = it.next();
            System.out.println(entry.getKey() + entry.getValue());
//            Set<Trees> myTrees = entry.getValue();
//            Boolean next = it.hasNext();
//            while (next) {
//                System.out.println(it.next());
//                Iterator<Trees> treesIt = myTrees.iterator();
//                while (treesIt.hasNext()) {
//                    Trees t = treesIt.next();
//                    t.collect();
        }
        System.out.println( );
            Iterator<Trees> appleIterator=appleSet.iterator();
            while (appleIterator.hasNext()){
                Trees t=appleIterator.next();
                t.collect();
            }
            System.out.println( );
            Iterator<Trees> cherryIterator= cherrySet.iterator();
            while (cherryIterator.hasNext()){
                Trees c=cherryIterator.next();
                c.collect();
            }
            System.out.println( );
            Iterator<Trees> pearsIterator=pearsSet.iterator();
            while (pearsIterator.hasNext()){
                Trees p = pearsIterator.next();
                p.collect();
            }


            }

        }

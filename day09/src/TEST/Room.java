package TEST;

import java.util.*;

public class Room {
    //1、准备好54张牌，定义一个容器
    private List<Card> allcards =new ArrayList<>();
    //2、初始化54张牌进去
    {
        //3、准备点数
        String[] numbers={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        //4、准备花色
        String[] colors={"♠","♥","♣","♦"};
        //5、组合 花色和点数
        for (String color : colors) {
            for (String number : numbers) {
                allcards.add(new Card(color,number));
            }
        }
//        allcards.add(new Card("","小王"));
//        allcards.add(new Card("","大王"));
        Collections.addAll(allcards, new Card("","小王"),new Card("","大王"));
        System.out.println("新牌是"+ allcards);
    }
    public void start() {
        //6、洗牌
        Collections.shuffle(allcards);  //打乱方法
        System.out.println("洗牌后的牌是"+ allcards);

        //7、发牌，定义三个玩家，令狐冲、令狐白、令狐紫
        Map<String,List<Card>> players =new HashMap<>();

        List<Card> lhc =new ArrayList<>();
        players.put("令狐冲",lhc);
        List<Card> lhb =new ArrayList<>();
        players.put("令狐白",lhb);
        List<Card> lhz =new ArrayList<>();
        players.put("令狐紫",lhz);

        //只发51张牌
        for (int i = 0; i < allcards.size()-3; i++) {
            Card card = allcards.get(i);
            if (i%3==0){
                lhc.add(card);
            }else if(i%3==1){
                lhb.add(card);
            }else{
                lhz.add(card);
            }
        }
        //8、看牌(遍历players这个Map)
        for(Map.Entry<String,List<Card>> entry:players.entrySet()){
            //获取玩家名称
            String name=entry.getKey();
            //获取玩家牌
            List<Card> cards=entry.getValue();
            //遍历玩家的牌
            System.out.println(name+"的牌是："+ cards);
        }
        //9、底牌
        List<Card> lastcards =allcards.subList(allcards.size()-3,allcards.size());  //包前不包后
        System.out.println("底牌是："+ lastcards);
        //10、抢地主
        lhc.addAll(lastcards);
        System.out.println("地主的牌是："+ lhc);
    }
}

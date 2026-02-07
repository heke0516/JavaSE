package TEST;

public class GameDemo {
    public static void main(String[] args) {
        //实现斗地主
        //每张牌都是一个牌类
        //游戏房间也是一个对象，创建一个房间对象
        Room room = new Room();
        room.start();
    }
}

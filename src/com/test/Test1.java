package com.test;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        String str = "咱两个在学校整整三年，相处之中无话不谈，" +
                "我难忘你叫我看董存瑞，你记得我叫你看刘胡兰，" +
                "董存瑞为人民粉身碎骨，刘胡兰为祖国把热血流干，咱看了一遍又一遍，你蓝笔点来我红笔圈，" +
                "我也曾感动得流过眼泪，你也曾写诗词贴在床边，" +
                "咱俩个抱定了共同志愿，要决心做一个有志青年，" +
                "你说过党叫干啥就干啥，决不能挑肥拣瘦讲价钱，" +
                "你说的话讲的话，一字一句全忘完，" +
                "想想烈士比比咱，有什么苦来怕什么难，" +
                "你要远走你就走，我坚决在农村干它一百年。" +
                "" +
                "亲家母你坐下，咱们说说心里话，" +
                "亲家母咱都坐下，咱们随便拉一拉，" +
                "老嫂子你到俺家，尝尝俺山沟里大西瓜，自从银环离开家，知道你心里常牵挂，出门没有带被子，她失急慌忙离开家，你到家里看一看，铺的什么盖的什么，做了一套新铺盖，新里新表新棉花，在家没有种过地，她一次锄把也没有拿，家里地里都能干，十人见了九人夸，又肯下力有文化，不愁当一个哪啥?啥?啥" +
                "当一个农业科学家" +
                "对，当一个农业科学家，针线活她不会，端碗还嫌手腕麻，吃穿不用她粘手，现有巧真俺娘俩。" +
                "老嫂子你放心吧，婆婆不会难为她，在家生来好喝水，一天三遍不离茶，一天到晚有开水，茶瓶暖壶有俩仨，婆婆是个忠厚人，姑嫂亲得象一个妈，女婿是个好社员，" +
                "她的公公，她公公种地是个老行家，虽说吵过两句嘴，怨我的水平态度差，一家人不说两家话，俺的娘待我像亲妈，咱一家要听党的话，朝阳沟就是咱们的家。" +
                "";
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i < str.length(); i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            }else {
                map.put(str.charAt(i), 1);
            }
        }
        StringBuffer sb = new StringBuffer();
//        List<Node> list = new ArrayList<>();
        for(Character key : map.keySet()){
            sb.append(key + ", ");
//            Character keytemp = key;
//            int count = map.get(keytemp);
//            for(Character key2 : map.keySet()){
//                if(map.get(key2) > count){
//                    keytemp = key2;
//                    count = map.get(key2);
//                }
//            }
//            list.add(new Node(keytemp, count));
        }
//        for(int i = 0; i < list.size(); i++){
//            sb.append(list.get(i) + ", ");
//        }
        System.out.println(map.keySet().size());
        System.out.println(sb.toString());
    }
    private static class Node{
        private Character key;
        private Integer count;

        public Node(Character key, Integer count){
            this.key = key;
            this.count = count;
        }

        @Override
        public String toString(){
            return key + "-->" + count;
        }
    }
}

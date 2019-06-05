package com.gupao.list;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test {





    public static void main(String [] args){

        List<User> users = new ArrayList<>();

        for (long i=1;i<=3;i++){
            users.add(new User(i,"用户"+i));

        }

        WhiteListService whiteListService = new WhiteListServiceImpl();

        whiteListService.add(users);

        long endTime = new Date().getTime();
        long startTime = new Date().getTime();

        System.out.println("耗时"+(endTime-startTime) +"ms");


        long endTime2 = new Date().getTime();

        whiteListService.concurrencyAdd(users);
        long startTime2 = new Date().getTime();

        System.out.println("耗时"+(endTime2-startTime2) +"ms");

    }


}

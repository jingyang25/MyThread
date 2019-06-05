package com.gupao.list;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class WhiteListServiceImpl implements WhiteListService {


    @Override
    public boolean add(User user) {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return true;
    }

    @Override
    public int add(List<User> users) {
        int successCount = 0;

        for (User user:users){
            boolean addRes = add(user);

            if (addRes){
                successCount++;
            }else{
                System.out.println("本条执行失败，user"+user);
            }
        }

        System.out.println("成功添加："+successCount+"条");
        return successCount;
    }

    @Override
    public int concurrencyAdd(List<User> users) {

        ExecutorService executorService = Executors.newWorkStealingPool(3);

        int successCount = 0;

        List<Future<Boolean>> futures = new ArrayList<>();

        for (final User user:users) {

            Future<Boolean> future = executorService.submit(new Callable<Boolean>() {
                @Override
                public Boolean call() throws Exception {
                    return add(user);
                }
            });

            futures.add(future);
        }











        return 0;
    }
}

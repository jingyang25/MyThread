package com.gupao.list;

import java.util.List;

public interface WhiteListService {

    boolean add(User user);

    int add(List<User> users);

    int concurrencyAdd(List<User> users);
}

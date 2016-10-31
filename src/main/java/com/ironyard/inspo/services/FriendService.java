package com.ironyard.inspo.services;

import com.ironyard.inspo.data.Friend;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by reevamerchant on 10/31/16.
 */
public class FriendService {

    public List<Friend> generateFaveTakeoutSpots(){
        List<Friend> mylist = new ArrayList<>();
        mylist.add(new Friend("Emma Swan", "peanuts", true, "10/23/1983", 1));
        mylist.add(new Friend("Hermione Granger", "none", false, "09/19/1979", 2));
        return mylist;
    }

}

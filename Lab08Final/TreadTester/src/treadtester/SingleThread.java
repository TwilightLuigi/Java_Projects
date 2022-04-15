/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treadtester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Sierra
 */
public class SingleThread extends Thread {

    private ArrayList list;
    private ArrayList list2;
    private ArrayList list3;

    public SingleThread(ArrayList list, ArrayList list2, ArrayList list3) {
        this.list = list;
        this.list2 = list2;
        this.list3 = list3;

    }

    @Override
    public void run() {

        Collections.sort(list);
        Collections.sort(list2);
        Collections.sort(list3);

    }
}

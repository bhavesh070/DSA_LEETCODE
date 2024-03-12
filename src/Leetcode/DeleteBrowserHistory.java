package PACKAGE_NAME.Leetcode;

import java.util.ArrayList;
import java.util.List;

class BrowserHistory{
    List<String> els = new ArrayList<>();
    int index = 0;
    public BrowserHistory(String homepage) {
        els.add(homepage);
        index = 0;
    }

    public void visit(String url) {
        els.subList(index+1, els.size()).clear();
        els.add(url);
        index++;
    }

    public String back(int steps) {
        index  = Math.max(0,index-steps);
        return els.get(index) ;
    }

    public String forward(int steps) {
        index = Math.min(els.size()-1, index+steps);
        return els.get(index);
    }
}
public class DeleteBrowserHistory {
    public static void main(String[] args) {
        
    }
}

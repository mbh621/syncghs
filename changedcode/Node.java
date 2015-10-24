import java.util.ArrayList;
import java.util.List;

/*
 * created by : Prashant Prakash
 * created_date : 14th oct 2015 
 */
public class Node {
    public String ID;
    public String componentId;
    public Link parent;
    public List<Link> children;
    public List<Link> potentialLinks; // Links that are potentially merge links
    public List<Link> rejectedLinks;
    public List<Link> allLinks; // list of all links

    public Node(String ID, String componentId) {
        this.ID = ID;
        this.componentId = componentId;
        parent = null;
        children = new ArrayList<Link>();
        potentialLinks = new ArrayList<Link>();
        rejectedLinks = new ArrayList<Link>();
        allLinks = new ArrayList<Link>();
    }

    public void addLink(Link link) {
        potentialLinks.add(link);
        allLinks.add(link);
    }

}
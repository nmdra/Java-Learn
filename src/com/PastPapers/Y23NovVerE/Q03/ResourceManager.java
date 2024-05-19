package PastPapers.Y23NovVerE.Q03;

import java.util.ArrayList;

public class ResourceManager {

    private final ArrayList<Integer> resources;
    int Tresources;

    public ResourceManager(int TResources) {

        this.Tresources = TResources;
        this.resources = new ArrayList<>();

        for (int i = 0; i < TResources; i++) {
            resources.add(i);
        }
    }

    public int requestResource() {
        if (resources.isEmpty()) {
            return -1;
        } else {
            return resources.removeFirst();
        }
    }

    public void releaseResource(int res) {
        if (resources.size() <= Tresources && res != -1) {
            resources.addFirst(res);
            notify();
        }
    }
}
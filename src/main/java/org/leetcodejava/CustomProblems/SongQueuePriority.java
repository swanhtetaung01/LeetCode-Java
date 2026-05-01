package org.leetcodejava.CustomProblems;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SongQueuePriority {

    List<String> updatedSongQueue(List<String> queue, List<String> priority) {
        List<String> updatedQueue = new ArrayList<>(priority);

        Set<String> prioritySet = new HashSet<>(priority);

        for(String song : queue) {
            if(!prioritySet.contains(song)) {
                updatedQueue.add(song);
            }
        }

        return updatedQueue;
    }
}

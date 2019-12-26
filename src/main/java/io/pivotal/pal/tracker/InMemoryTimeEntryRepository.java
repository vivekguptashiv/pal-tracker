package io.pivotal.pal.tracker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryTimeEntryRepository  implements TimeEntryRepository{

    //public List<TimeEntry> timeEntryList;
    private Map<Long,TimeEntry> timeEntryList =new HashMap<>();
    private long eid=1L;
    public TimeEntry create(TimeEntry t){
        t.setId(eid);
        timeEntryList.put(eid,t);
        eid++;
        return t;
    }

    public TimeEntry find(Long id){

        return timeEntryList.get(id);
    }

    public TimeEntry update(Long id,TimeEntry tm){
        if(!timeEntryList.containsKey(id))
        return null;

        tm.setId(id);
        timeEntryList.put(id,tm);

        return tm;
    }
    public List<TimeEntry> list(){
        return timeEntryList!=null?new ArrayList<>(timeEntryList.values()):null;
    }
    public void delete(Long id){
        TimeEntry deletedTimeEntry = timeEntryList.get(id);
        timeEntryList.remove(id, deletedTimeEntry);
    }

}

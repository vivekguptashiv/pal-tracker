package io.pivotal.pal.tracker;

import java.util.List;

public interface TimeEntryRepository {

    TimeEntry create(TimeEntry t);
    TimeEntry find(Long id);
    TimeEntry update(Long id,TimeEntry t);
    List<TimeEntry> list();
    void delete(Long id);
}

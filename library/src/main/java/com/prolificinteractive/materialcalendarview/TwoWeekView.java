package com.prolificinteractive.materialcalendarview;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;

import java.util.Calendar;
import java.util.Collection;

/**
 * Display a two week of {@linkplain DayView}s and
 * fourteen {@linkplain WeekDayView}s.
 */
@Experimental
@SuppressLint("ViewConstructor")
public class TwoWeekView extends CalendarPagerView {

    public TwoWeekView(@NonNull MaterialCalendarView view, CalendarDay firstViewDay,
                       int firstDayOfWeek, boolean showWeekDays) {
        super(view, firstViewDay, firstDayOfWeek, showWeekDays);
    }

    @Override
    protected void buildDayViews(Collection<DayView> dayViews, Calendar calendar) {
        for (int i = 0; i < (DEFAULT_DAYS_IN_WEEK * 2); i++) {
            addDayView(dayViews, calendar);
        }
    }

    @Override
    protected boolean isDayEnabled(CalendarDay day) {
        return true;
    }

    @Override
    protected int getRows() {
        return showWeekDays ? DAY_NAMES_ROW + 2 : 2;
    }
}

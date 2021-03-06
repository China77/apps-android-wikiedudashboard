package org.wikiedufoundation.wikiedudashboard.course_detail.common.view;

import org.wikiedufoundation.wikiedudashboard.course_detail.common.data.CourseDetail;
import org.wikiedufoundation.wikiedudashboard.helper.Progressive;
import org.wikiedufoundation.wikiedudashboard.helper.Toaster;

public interface CourseDetailView extends Progressive, Toaster {
    void setData(CourseDetail data);
}

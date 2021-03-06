package org.wikiedufoundation.wikiedudashboard.helper;

import org.wikiedufoundation.wikiedudashboard.course_detail.articles_edited.data.ArticlesEdited;
import org.wikiedufoundation.wikiedudashboard.course_detail.coures_students.data.StudentListResponse;
import org.wikiedufoundation.wikiedudashboard.course_detail.common.data.CourseDetailResponse;
import org.wikiedufoundation.wikiedudashboard.course_detail.uploads.data.CourseUploadResponse;
import org.wikiedufoundation.wikiedudashboard.course_list.data.ExploreCoursesResponse;
import org.wikiedufoundation.wikiedudashboard.dashboard.data.MyDashboardResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Url;

public interface WikiEduDashboardApi {

    @GET
    Call<CourseDetailResponse> getCourseDetail(@Url String url);

    @GET
    Call<ArticlesEdited> getArticlesEdited(@Url String url);

    @GET
    Call<StudentListResponse> getStudentList(@Url String url);

    @GET
    Call<CourseUploadResponse> getCourseUploads(@Url String url);

    @GET("dashboard.json")
    Call<MyDashboardResponse> getDashboardDetail(@Header("Cookie") String sessionIdAndToken);

    @GET("explore.json")
    Call<ExploreCoursesResponse> getExploreCourses(@Header("Cookie") String sessionIdAndToken);
}

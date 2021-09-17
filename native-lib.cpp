#include <jni.h>
#include <string>

using namespace std;

extern "C" JNIEXPORT __unused  jstring JNICALL
Java_com_example_projectwork_MainActivity3_javaMethod(
        JNIEnv* env,
        jobject, jint x) {
    x *= 2;
    //tcl = result + answer;
    string answer = to_string(x);
    string result = "course unit is " + answer;
    //string
    return env->NewStringUTF(result.c_str());
}

extern "C" JNIEXPORT __unused  jstring JNICALL
Java_com_example_projectwork_MainActivity3_cppMethod(
        JNIEnv* env,
        jobject, jint x) {
    x *= 1.5;
    string answer = to_string(x);
    string result = "course unit is " + answer;
    return env->NewStringUTF(result.c_str());
}

extern "C" JNIEXPORT __unused  jstring JNICALL
Java_com_example_projectwork_MainActivity3_iosMethod(
        JNIEnv* env,
        jobject, jint x) {
    x *= 2.5;
    string answer = to_string(x);
    string result = "course unit is " + answer;
    return env->NewStringUTF(result.c_str());
}

extern "C" JNIEXPORT __unused  jstring JNICALL
Java_com_example_projectwork_MainActivity3_jscriptMethod(
        JNIEnv* env,
        jobject, jint x) {
    x *= 3;
    string answer = to_string(x);
    string result = "course unit is " + answer;
    return env->NewStringUTF(result.c_str());
}

extern "C" JNIEXPORT __unused  jstring JNICALL
Java_com_example_projectwork_MainActivity3_csharpMethod(
        JNIEnv* env,
        jobject, jint x) {
    x *= 4;
    string answer = to_string(x);
    string result = "course unit is " + answer;
    return env->NewStringUTF(result.c_str());
}

extern "C" JNIEXPORT __unused  jstring JNICALL
Java_com_example_projectwork_MainActivity3_adevMethod(
        JNIEnv* env,
        jobject, jint x) {
    x *= 1.5;
    string answer = to_string(x);
    string result = "course unit is " + answer;
    return env->NewStringUTF(result.c_str());
}

extern "C" JNIEXPORT __unused  jstring JNICALL
Java_com_example_projectwork_MainActivity3_phpMethod(
        JNIEnv* env,
        jobject, jint x) {
    x *= 4;
    string answer = to_string(x);
    string result = "course unit is " + answer;
    return env->NewStringUTF(result.c_str());
}

extern "C" JNIEXPORT __unused  jstring JNICALL
Java_com_example_projectwork_MainActivity3_mysqlMethod(
        JNIEnv* env,
        jobject, jint x) {
    x *= 3;
    string answer = to_string(x);
    string result = "course unit is " + answer;
    return env->NewStringUTF(result.c_str());
}

extern "C" JNIEXPORT __unused  jstring JNICALL
Java_com_example_projectwork_MainActivity3_pshopMethod(
        JNIEnv* env,
        jobject, jint x) {
    x *= 1.5;
    string answer = to_string(x);
    string result = "course unit is " + answer;
    return env->NewStringUTF(result.c_str());
}

extern "C" JNIEXPORT __unused  jstring JNICALL
Java_com_example_projectwork_MainActivity3_mobdevMethod(
        JNIEnv* env,
        jobject, jint x) {
    x *= 3;
    string answer = to_string(x);
    string result = "course unit is " + answer;
    return env->NewStringUTF(result.c_str());
}




//}extern "C"
//JNIEXPORT jstring JNICALL
//Java_com_example_projectwork_MainActivity_regis(JNIEnv *env, jobject thiz) {
    // TODO: implement regis()F(head.c_str());

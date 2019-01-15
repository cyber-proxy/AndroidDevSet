# AndroidDevSet
搜集各种Android开发过程中需要用到的知识和工具（[EngLish Readme](https://github.com/tsotumu/AndroidDevSet/new/master?readme=1)）
## 代码中涉及到但不仅限于:
 * Activity的各个生命周期回调，及其用处
 	* onPostCreated，`是否可以执行View.getMeasuredHeight()`<br>
    ```java
    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
    } 
    ```
 * 沉浸式状态栏以及状态栏颜色的改变（沉浸式状态栏后，状态栏文本颜色如果和沉浸颜色相似，导致状态栏文本模糊）
 * GooglePlay内购示例代码
 * 一些常用的UI组件
 	* 设置图片圆角
    * 阿斯蒂芬
    * 阿斯蒂芬
 * Android开发中如何优化性能
    * LeakCanary源码解析
    * BlockCanary源码解析
    * Glide实现图片加载，其优化原理解析
 * LocalBroadcastManager和普通广播的区别
    * 广播的设计模式
 * Gradle语法和用法
 * Gradle插件开发
    * 阿斯蒂芬
 * Okhttp源码解析
 * Binder介绍（四大组件及进程间通信方式原理解析）
	
  

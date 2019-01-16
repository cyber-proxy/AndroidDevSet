# AndroidDevSet
 * 集成各种Android开发过程中需要用到的知识[English DOC](https://github.com/tsotumu/AndroidDevSet/blob/master/README_ENG.md)
 * Android开发学习仅仅需要此工程即可，此工程包罗了所有技术关键点和难点。
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
    * 待添加
    * 各种动画效果（属性动画，clappse动画）
 * Android开发中如何优化性能
    * LeakCanary源码解析
    * BlockCanary源码解析
    * Glide实现图片加载，其优化原理解析
    * App性能检测与分析
 * LocalBroadcastManager和普通广播的区别
    * 广播的设计模式
 * Gradle语法和用法
 * Gradle插件开发
    * 阿斯蒂芬
 * Okhttp源码解析
 * Binder介绍（四大组件及进程间通信方式原理解析）
 * 逆向与反逆向
    * 混淆
    * 打包
    * 二次打包
 * Binder相关知识
 * Multidex相关知识
 * JNI开发
 * Linux相关知识	
  

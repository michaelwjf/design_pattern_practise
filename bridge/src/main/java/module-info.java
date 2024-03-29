/**
 * This module introduce the bridge pattern.
 * <p/>
 * 需求示例：
 * <p/>
 * 手机操作问题 <br>
 * 现在对不同手机类型的不同品牌实现操作编程（比如：开机，关机，打电话等）。<br>
 * 层级结构如下所示：
 * 手机 --> （折叠式，直立式，旋转式） <br>
 * 折叠式 --> （华为，小米，Vivo） <br>
 * 直立式 --> （华为，小米，Vivo） <br>
 * 旋转式 --> （华为，小米，Vivo）
 *
 * <p/>
 * 使用传统方式解决这个问题的类图如mobile-traditional-way.puml所示。
 * <p/>
 * 传统方案解决手机操作问题分析：<br>
 * 扩展性问题，如果我们再增加手机的样式，就需要增加各个品牌的手机类，同样如果我们增加一个手机
 * 品牌，也要在各个手机样式类下面增加。增加了代码维护成本。<br>
 *
 * @author jfw
 * @date 2023-09-25
 */module bridge {
}
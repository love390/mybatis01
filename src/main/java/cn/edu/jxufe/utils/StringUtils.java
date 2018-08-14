package cn.edu.jxufe.utils;

/**
 * @Author cgg 891842749@qq.com
 * @Date 2018-08-01 15:14:21
 * @Description gitee:www.gitee.com/cgggitee/
 */
public class StringUtils {
    public static boolean isNotNULL(Object s) {
        if (s == null || s.equals("") || String.valueOf(s).trim().equals(""))
            return false;
        else return true;
    }
}

package exercise;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Calendar3 {

    public String render(int year, int month) {
        /// 引数の month をチェック
        if (month < 1 || 12 < month) {
            throw new RuntimeException(""+month+": expected between 1 and 12.");
        }
        /// 
        Calendar firstDay = new GregorianCalendar(year, month - 1, 1);
        int ndays   = firstDay.getActualMaximum(Calendar.DATE);
        int weekday = firstDay.get(Calendar.DAY_OF_WEEK); // Mon: 2, Tue: 3, ..., Sat: 7, Sun: 1
        int start   = weekday == 1 ? 6 : weekday - 2;     // Mon: 0, Tue: 1, ..., Sat: 5, Sun: 6
        /// テーブル開始
        StringBuilder sb = new StringBuilder();
        sb.append("<table>\n");
        /// ヘッダー
        String[] names = { "Mo", "Tu", "We", "Th", "Fr", "Sa", "Su" };
        sb.append("  <thead>\n" +
                  "    <tr>\n");
        for (String name : names) {
            sb.append("      <th>").append(name).append("</th>\n");
        }
        sb.append("    </tr>\n" +
                  "  </thead>\n");
        /// 本体開始
        sb.append("  <tbody>\n");
        int i = 0;
        int n = start + ndays;
        while (i < n) {
            i++;
            /// <tr>: 週の始まりなら、行を開始
            if (i % 7 == 1) {
                sb.append("    <tr>\n");
            }
            /// <td></td>: 空白 (&nbsp;) または日 (1..31)
            if (i <= start) {
                sb.append("      <td>").append("&nbsp;").append("</td>\n");
            } else {
                sb.append("      <td>").append(i - start).append("</td>\n");
            }
            /// </tr>: 週の終わりなら、行を終了
            if (i % 7 == 0) {
                sb.append("    </tr>\n");
            }
        }
        /// 行が終了してない場合は終了させる
        if (i % 7 != 0) {
            sb.append("    </tr>\n");
        }
        /// 本体終了
        sb.append("  </tbody>\n");
        /// テーブル終了
        sb.append("</table>\n");
        return sb.toString();
    }

    public static void main(String[] args) {
        Calendar3 cal = new Calendar3();
        String output = cal.render(2016, 5);
        System.out.println(output);
    }

}

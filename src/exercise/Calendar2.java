package exercise;

public class Calendar2 {

    public String render(int ndays, int start) {
        /// validate arguments
        if (start < 0 || 6 < start) {
            throw new RuntimeException(""+start+": expected between 0 and 6.");
        }
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
        int n = ndays + start;
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
        Calendar2 cal = new Calendar2();
        String output = cal.render(30, 5);
        System.out.println(output);
    }

}

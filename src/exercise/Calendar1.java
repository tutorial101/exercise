package exercise;

public class Calendar1 {

    public String render(int ndays) {
        StringBuilder sb = new StringBuilder();
        sb.append("<table>\n");
        /// header
        String[] names = { "Mo", "Tu", "We", "Th", "Fr", "Sa", "Su" };
        sb.append("  <thead>\n" + "    <tr>\n");
        for (String name : names) {
            sb.append("      <th>").append(name).append("</th>\n");
        }
        sb.append("    </tr>\n" + "  </thead>\n");
        /// body
        sb.append("  <tbody>\n");
        int i = 1;
        for (; i <= ndays; i++) {
            if (i % 7 == 1) {
                sb.append("    <tr>\n");
            }
            sb.append("      <td>").append(i).append("</td>\n");
            if (i % 7 == 0) {
                sb.append("    </tr>\n");
            }
        }
        if (i % 7 != 0) {
            sb.append("    </tr>\n");
        }
        sb.append("  </tbody>\n");
        ///
        sb.append("</table>\n");
        return sb.toString();
    }

    public static void main(String[] args) {
        Calendar1 cal = new Calendar1();
        String output = cal.render(30);
        System.out.println(output);
    }

}

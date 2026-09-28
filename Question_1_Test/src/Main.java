//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    String[] city = {"Cape Town","Port Elizabeth", "Pretoria"};
    String[] consoles = {"PS5", "XBOX", "SWITCH"};
    int[][] sales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}};

    System.out.println("--------------------------------------------------");
    System.out.println("GAMING CONSOLE REPORT");
    System.out.println("--------------------------------------------------");

    for (int con = 0; con < consoles.length; con++) {
        System.out.printf("%-15s", consoles[con]);
    }
    System.out.println();

    for (int cit = 0; cit < city.length; cit++) {
        System.out.println(city[cit]);
    for (int brand = 0; brand < sales[cit].length; brand++) {
            System.out.printf("%-15d", sales[cit][brand]);
        }

    }
  System.out.println();

}

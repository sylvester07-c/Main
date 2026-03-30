public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex){
        if(tonerLevel < 0){
            tonerLevel = 0;
        }

        if(pagesPrinted < 0){
            pagesPrinted = 0;
        }

        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;

    }

    public int addToner(int tonerAmount) {
        if((tonerAmount + tonerLevel) > 100 || tonerAmount + tonerLevel < 0) {
            return  -1;
        }
        return  tonerLevel + tonerAmount;
    }

    public int printPages(int pages){
        if(duplex) {
            System.out.println("Duplex printer")
        }
        int printedPages = pages;
        System.out.printf("You printed %d", pages);
        return  printedPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}

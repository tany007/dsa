package org.example.streams;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SumOfTransaction {

    public static class Transaction{
        private Date date;
        private int amount;

        public Transaction(Date date, int amount) {
            this.date = date;
            this.amount = amount;
        }

        public Date getDate() {
            return date;
        }
        public void setDate(Date date) {
            this.date = date;
        }
        public int getAmount() {
            return amount;
        }
        public void setAmount(int amount) {
            this.amount = amount;
        }
    }

    public static void main(String[] args) throws ParseException {
        // Example usage
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        List<Transaction> transactions = List.of(
                new Transaction(dateFormat.parse("2022-10-12"), 800),
                new Transaction(dateFormat.parse("2022-10-11"), 100),
                new Transaction(dateFormat.parse("2022-10-10"), 300),
                new Transaction(dateFormat.parse("2022-10-11"), 500),
                new Transaction(dateFormat.parse("2022-10-10"), 200),
                new Transaction(dateFormat.parse("2022-10-12"), 200)
        );

        Map<Date, Integer> sumByDay = transactions.stream().collect(Collectors.groupingBy(Transaction::getDate,
                Collectors.summingInt(Transaction::getAmount)));
        sumByDay.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(e ->
            System.out.println("Date: " + e.getKey() + ", Sum: " + e.getValue()));

        /*for(Map.Entry<Date, Integer> entry : sumByDay.entrySet()){
            System.out.println("Date: " + entry.getKey() + ", Sum: " + entry.getValue());
        }*/
    }
}

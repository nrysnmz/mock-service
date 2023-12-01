//public class FinancialTransactionBuilder {
//
//    public ArrayList<FinancialTransaction> buildFinancialTransactions(
//            String transactionIdentifier,
//            String productIdentifier,
//            String accountNumber,
//            String last4AccountNumber,
//            String bankIdentifier,
//            int transactionAmount,
//            String currencyCode,
//            String transactionTypeCode,
//            String transactionReferenceNumber,
//            String clientReferenceNumber,
//            String longTransactionDescription,
//            String transactionRequestTypeName,
//            String transactionSettlementDate,
//            long generalLedgerAccountNumber,
//            String transactionPostTimestamp,
//            String financialTransactionIdentifier
//    )
//
//    {
//        ArrayList<FinancialTransaction> fn = new ArrayList<>();
//        FinancialTransaction financialTransaction = FinancialTransaction.builder()
//                .postingInstructionTransactionIdentifier(transactionIdentifier)
//                .account(Account.builder()
//                        .productIdentifier(productIdentifier)
//                        .accountNumber(accountNumber)
//                        .last4AccountNumber(last4AccountNumber)
//                        .bankIdentifier(bankIdentifier)
//                        .build())
//                .amount(Amount.builder()
//                        .transactionAmount(transactionAmount)
//                        .currencyCode(currencyCode)
//                        .build())
//                .transactionTypeCode(transactionTypeCode)
//                .transactionReferenceNumber(transactionReferenceNumber)
//                .clientReferenceNumber(clientReferenceNumber)
//                .transactionDescription(TransactionDescription.builder()
//                        .longTransactionDescription(longTransactionDescription)
//                        .build())
//                .transactionDetails(TransactionDetails.builder()
//                        .transactionRequestTypeName(transactionRequestTypeName)
//                        .build())
//                .transactionSettlementDate(transactionSettlementDate)
//                .generalLedgerAccountNumber(generalLedgerAccountNumber)
//                .transactionPostTimestamp(transactionPostTimestamp)
//                .financialTransactionIdentifier(financialTransactionIdentifier)
//                .build();
//        fn.add(financialTransaction);
//        return fn;
//    }
//
//    public static void main(String[] args) {
//        FinancialTransactionBuilder builder = new FinancialTransactionBuilder();
//
//        ArrayList<FinancialTransaction> transactions = builder.buildFinancialTransactions(
//                "3bb7a002-f189-4714-9ecc-e879169c7a8b",
//                "090",
//                "00000000XX00000XXX00XXX",
//                "0998",
//                "0000000802",
//                1,
//

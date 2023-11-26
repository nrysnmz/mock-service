//package com.example.mockservice.learning;
//
//// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
//// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
///* ObjectMapper om = new ObjectMapper();
//Root root = om.readValue(myJsonString, Root.class); */
//public class Root{
//        public String postingBatchTransactionIdentifier;
//        public ArrayList<FinancialTransaction> financialTransactions;
//        public String postingOperationStatusName;
//}
//public class FinancialTransaction{
//        public String postingInstructionTransactionIdentifier;
//        public Account account;
//        public Amount amount;
//        public String transactionTypeCode;
//        public String transactionReferenceNumber;
//        public String clientReferenceNumber;
//        public TransactionDescription transactionDescription;
//        public TransactionDetails transactionDetails;
//        public String transactionSettlementDate;
//        public int generalLedgerAccountNumber;
//        public Date transactionPostTimestamp;
//        public String financialTransactionIdentifier;
//}
//public class Account{
//        public String productIdentifier;
//        public String accountNumber;
//        public String last4AccountNumber;
//        public String bankldentifier;
//}
//
//public class Amount{
//        public int transactionAmount;
//        public String currencyCode;
//}
//public class TransactionDescription{
//        public String longTransactionDescription;
//}
//
//public class TransactionDetails{
//        public String transactionRequestTypeName;
//}
//

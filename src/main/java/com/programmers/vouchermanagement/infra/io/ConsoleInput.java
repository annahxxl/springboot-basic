package com.programmers.vouchermanagement.infra.io;

import com.programmers.vouchermanagement.domain.voucher.VoucherType;

import java.util.Scanner;

public class ConsoleInput {
    private final Scanner scanner;

    public ConsoleInput() {
        this.scanner = new Scanner(System.in);
    }

    public int readVoucherTypeId() {
        VoucherType.printAllDescriptionsToConsole();
        return readInt("Please select a voucher type > ", "❌ Invalid input. Please enter a valid voucher type > ");
    }

    public Long readAmount() {
        return readLong("Please enter the amount > ", "❌ Invalid input. Please enter a valid amount > ");
    }

    private int readInt(String prompt, String errorMessage) {
        System.out.print(prompt);
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print(errorMessage);
            }
        }
    }

    private long readLong(String prompt, String errorMessage) {
        System.out.print(prompt);
        while (true) {
            try {
                return Long.parseLong(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print(errorMessage);
            }
        }
    }
}

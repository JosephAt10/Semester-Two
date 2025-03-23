class Power {
    int baseNumber, exponent;

    Power(int base, int exp) {
        baseNumber = base;
        exponent = exp;
    }
    int powerBF(int base, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base; 
        }
        return result; 
    }
    int powerDC(int base, int exp) {
        if (exp == 1) { 
            return base;
        } else {
            int halfPower = powerDC(base, exp / 2); 
            if (exp % 2 == 1) { 
                return halfPower * halfPower * base;
            } else { 
                return halfPower * halfPower;
            }
        }
    }
}

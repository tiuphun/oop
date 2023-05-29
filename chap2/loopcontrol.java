public int myMethod (int x){
    int sum = 0;
    outer: for (int i = 0; i < x; i++){
        inner: for (int j = i; j < x; j++){
            sum++;
            if (j == 1) continue;
            if (j == 2) continue outer;
            if (j == 3) break;
            if (j == 4) break outer;
        }
    }
    return sum;
}
public class test {
    void sorting (int[] item, int count) {
        int pass, min_index, i, temp;
        for(pass = 0; pass<count-1 ; pass++) {
            min_index = pass;
            temp = item[pass];
            for(i = pass+1; i<count; i++) {
                if(item[i]<temp) { //begin if
                    min_index = i;
                    temp = item[i]; }}
            temp = item[min_index];
            item[min_index] = item[pass];
            item[pass] = temp;
        }//end for1 }

    }
}

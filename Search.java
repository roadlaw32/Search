class Main {

  public static void main(String args[]) {
    // 昇順にソートされた配列
    int[] sortedArray = { 1, 2, 3, 5, 12, 7890, 12345 };
    // 探索対象の番号
    int targetNumber = 7890;
    // 探索実行
    int targetIndex = new Main().serchIndex(sortedArray, targetNumber);
    // 結果出力
    System.out.println(targetIndex);
  }

  private int serchIndex(int[] sortedArray, int targetNumber) {

    // ここから記述
	  
    // 中間値のインデックス
    int middleIndex = 0;
    // 対象となる配列範囲の最小のインデックス
　　int lowIndex = 0;
    // 対象となる配列範囲の最大のインデックス
　　int highIndex = sortedArray.length;
　　while (true) {
    　// 中間値のインデックスを求める
    　// 対象配列の要素数が偶数である場合
      if ((highIndex-lowIndex+1) % 2 == 0) {
	      middleIndex = (highIndex - lowIndex + 1) / 2;
      } else {
      // 対象配列の要素数が奇数である場合 
	      middleIndex = (highIndex - lowIndex) / 2;
　　  }
      // 中間値と探索対象の値が一致した場合は、
      // 中間値のインデックスを返す。
      if (targetNumber == sortedArray[middleIndex]) {
	      return middleIndex;
      } else if (targetNumber <= sortedArray[middleIndex]) {
      // もし中間値よりも探索対象の値が小さければ、
      // 次の対象となる配列のインデックスの範囲は
      // lowInde~middleIndexまでとなる。
      // よって、最大のインデックスはmiddleIndexに変わる。
	      highIndex = middleIndex;
      } else {
        // もし中間値よりも探索対象の値が大きければ、
        // 次の対象となる配列のインデックスの範囲は
        // middleIndex~highIndexまでとなる。
        // よって、最小のインデックスはmiddleIndexに変わる。
	      lowIndex = middleIndex;
      }
    }
	  
    // ここまで記述

    // 探索対象が存在しない場合、-1を返却
    return -1;
  }
}

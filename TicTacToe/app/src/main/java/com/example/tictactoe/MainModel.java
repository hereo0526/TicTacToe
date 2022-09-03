package com.example.tictactoe;

public class MainModel {
    private int turn = 0;
    private int[][] arr = new int[3][3];
    private int i = 0;
    private int turn_cnt = 0;
    private int winner_number = 0; //(win player num * 10) + (line num)

    public int getTurn(){
        return this.turn;
    }
    public void setTurn(int i){
        this.turn = i;
    }

    public int getTurnCnt(){
        return this.turn_cnt;
    }
    public void setTurnCnt(int i){
        this.turn_cnt = i;
    }

    public int getArr(int x, int y){
        return arr[x][y];
    }
    public void setArr(int x, int y){
        if(turn == 0)
            arr[x][y] = 1;
        else
            arr[x][y] = 10;
    }
    public void clearArr(){
        for(int m = 0; m < 3 ; m += 1) {
            for (int n = 0; n < 3; n += 1) {
                arr[n][m] = 0;
            }
        }
    }
    public void setWinnerNum(int i){
        this.winner_number = i;
    }
    public int getWinner(){

        if (arr[0][2] + arr[1][1] + arr[2][0] == 3){
            winner_number = 11;
        }
        else if (arr[0][0] + arr[1][1] + arr[2][2] == 3){
            winner_number = 12;
        }
        else {
            for (i = 0; i < 3; i++) {
                if (arr[0][i] + arr[1][i] + arr[2][i] == 3) {
                    winner_number = 13+i;
                }
            }
            for (i = 0; i < 3; i++) {
                if (arr[i][0] + arr[i][1] + arr[i][2] == 3) {
                    winner_number = 16+i;
                }
            }
        }
        ////////////////////////////////////////////////////////////////////////////////////////////
        if (arr[0][2] + arr[1][1] + arr[2][0] == 30){
            winner_number = 21;
        }
        else if (arr[0][0] + arr[1][1] + arr[2][2] == 30){
            winner_number = 22;
        }
        else {
            for (i = 0; i < 3; i++) {
                if (arr[0][i] + arr[1][i] + arr[2][i] == 30) {
                    winner_number = 23+i;
                }
            }
            for (i = 0; i < 3; i++) {
                if (arr[i][0] + arr[i][1] + arr[i][2] == 30) {
                    winner_number = 26+i;
                }
            }
        }
        return winner_number;
    }
/*

    while i<3 :
            a.append([0,0,0])
    i=i+1
    turn = 0
            while turn < 9 :
    o = 0
            while o == 0 :
    x, y = map(int, input('1번 차례:').split(','))
            if a[x][y] == 0 :
    a[x][y] = 1
    o = o +1
    turn = turn + 1
            else :
    print('이미 채워진 칸')
    print(a)
    if (a[0][0] + a[1][1] + a[2][2] == 3) or (a[0][2] + a[1][1] + a[2][0] == 3):
    winner = 1
            for j in range(2):
            if ((a[0][j] + a[1][j] + a[2][j] == 3) or (a[j][0] + a[j][1] + a[j][2] == 3)):
    winner = 1
            if winner !=0 :
            break
    elif turn == 9 :
            break
    o = 0
            while o == 0 :
    z, r = map(int, input('2번 차례:').split(','))
            if a[z][r] == 0 :
    a[z][r] = 10
    o = o +1
    turn = turn + 1
            else :
    print('이미 채워진 칸')
    print(a)
    if (a[0][0] + a[1][1] + a[2][2] == 30) or (a[0][2] + a[1][1] + a[2][0]  == 30):
    winner = 2
            for j in range(2):
            if ((a[0][j] + a[1][j] + a[2][j]  == 30) or (a[j][0] + a[j][1] + a[j][2] == 30)):
    winner = 2
            if winner !=0 :
            break
    elif turn == 9 :
            break

            if turn == 9 and winner == 0:
    print('무승부')
    elif winner == 1 :
    print('1번 승리')
    elif winner == 2 :
    print('2번 승리')

 */
}

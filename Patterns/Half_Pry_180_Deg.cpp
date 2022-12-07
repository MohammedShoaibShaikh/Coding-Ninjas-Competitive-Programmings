#include<iostream>
using namespace std;
// Half Pyramid After 180 Degree Rotation
int main(){
    int n;
    cout << "Enter the Value of N: ";
    cin >> n;

    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= n; j++){
            if(j <= n - i){
                cout << "  ";
            }
            else{
                cout << "*" << " ";
            }
        }
        cout << endl;
    }
    return 0;
}

// #include<iostream>
// using namespace std;

// int main(){
//     int n; cin >> n;
//     int f = 1;
//     while(n) {
//         f *= n;
//         n--;
//     }
//     cout << f;
//     return 0;
// }
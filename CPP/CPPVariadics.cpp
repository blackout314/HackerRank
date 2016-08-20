//
//  CPPVariadics.cpp
//  HackerRank
//
//  Created by Fabrizio Duroni on 20/08/16.
//  Copyright © 2016 Fabrizio Duroni. All rights reserved.
//
//  https://www.hackerrank.com/challenges/cpp-variadics

#include <cmath>
#include <iostream>

using namespace std;

template <bool ...digits>
int reversed_binary_value() {
    
    const size_t size = sizeof...(digits);
    bool bits[size] = {digits...};
    
    int number = 0;
    
    for (int i = 0; i < size; i++) {
        
        number += pow(2, i) * bits[i];
    }
    
    return number;
}

template <int n, bool...digits>
struct CheckValues {
    static void check(int x, int y)
    {
        CheckValues<n-1, 0, digits...>::check(x, y);
        CheckValues<n-1, 1, digits...>::check(x, y);
    }
};

template <bool...digits>
struct CheckValues<0, digits...> {
    static void check(int x, int y)
    {
        int z = reversed_binary_value<digits...>();
        std::cout << (z+64*y==x);
    }
};

int main()
{
    int t; std::cin >> t;
    
    for (int i=0; i!=t; ++i) {
        int x, y;
        cin >> x >> y;
        CheckValues<6>::check(x, y);
        cout << "\n";
    }
}

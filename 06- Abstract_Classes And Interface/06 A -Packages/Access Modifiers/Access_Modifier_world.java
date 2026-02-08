public class Access_Modifier_world {
    public static void main(String[] args) {
        // World Me Jab aap class package and subclass me na hotoh aap world me ho and
        // world me only public hi use kar sakte ho private protected and default use
        // nahin kar sakte ho app.
    }
}

// package p1 mein class C1 rakhiye aur usey public banaiye.

// package p2 mein ek nayi class banaiye (jo C1 ko extend na kare).

// Ab p2 ki class mein C1 ka object bana kar c.x, c.y, c.z print kijiye.

// Aap dekhenge ki sirf c.x (Public) print hoga. Baaki sab par Java Error dega
// kyunki wo "World" ke liye band hain.
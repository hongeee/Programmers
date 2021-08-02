package com.hongeee.programmers.practice.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuggestNewIdTest {

    @Test
    void solution()  {
        SuggestNewId solution = new SuggestNewId();
        assertEquals("bat.y.abcdefghi", solution.solution("...!@BaT#*..y.abcdefghijklm"));
        assertEquals("z--", solution.solution("z-+.^."));
        assertEquals("aaa", solution.solution("=.="));
        assertEquals("123_.def", solution.solution("123_.def"));
        assertEquals("abcdefghijklmn", solution.solution("abcdefghijklmn.p"));
        assertEquals("abcdefghijklmn", solution.solution(".abcdefghijklmn.p"));
    }
}
// This file was generated automatically by the Snowball to Java compiler

package org.tartarus.snowball.ext;

import org.tartarus.snowball.Among;

/**
 * This class was automatically generated by a Snowball to Java compiler It implements the stemming algorithm defined by a snowball script.
 */

public class germanStemmer extends org.tartarus.snowball.SnowballStemmer {

  private static final long serialVersionUID = 1L;

  private final static germanStemmer methodObject = new germanStemmer();

  private final static Among a_0[] = { new Among("", -1, 6, "", methodObject), new Among("U", 0, 2, "", methodObject),
      new Among("Y", 0, 1, "", methodObject), new Among("\u00E4", 0, 3, "", methodObject), new Among("\u00F6", 0, 4, "", methodObject),
      new Among("\u00FC", 0, 5, "", methodObject) };

  private final static Among a_1[] = { new Among("e", -1, 2, "", methodObject), new Among("em", -1, 1, "", methodObject),
      new Among("en", -1, 2, "", methodObject), new Among("ern", -1, 1, "", methodObject), new Among("er", -1, 1, "", methodObject),
      new Among("s", -1, 3, "", methodObject), new Among("es", 5, 2, "", methodObject) };

  private final static Among a_2[] = { new Among("en", -1, 1, "", methodObject), new Among("er", -1, 1, "", methodObject),
      new Among("st", -1, 2, "", methodObject), new Among("est", 2, 1, "", methodObject) };

  private final static Among a_3[] = { new Among("ig", -1, 1, "", methodObject), new Among("lich", -1, 1, "", methodObject) };

  private final static Among a_4[] = { new Among("end", -1, 1, "", methodObject), new Among("ig", -1, 2, "", methodObject),
      new Among("ung", -1, 1, "", methodObject), new Among("lich", -1, 3, "", methodObject), new Among("isch", -1, 2, "", methodObject),
      new Among("ik", -1, 2, "", methodObject), new Among("heit", -1, 3, "", methodObject), new Among("keit", -1, 4, "", methodObject) };

  private static final char g_v[] = { 17, 65, 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 0, 32, 8 };

  private static final char g_s_ending[] = { 117, 30, 5 };

  private static final char g_st_ending[] = { 117, 30, 4 };

  private int I_x;
  private int I_p2;
  private int I_p1;

  private void copy_from(germanStemmer other) {

    I_x = other.I_x;
    I_p2 = other.I_p2;
    I_p1 = other.I_p1;
    super.copy_from(other);
  }

  private boolean r_prelude() {

    int v_1;
    int v_2;
    int v_3;
    int v_4;
    int v_5;
    int v_6;
    // (, line 33
    // test, line 35
    v_1 = cursor;
    // repeat, line 35
    replab0: while (true) {
      v_2 = cursor;
      lab1: do {
        // (, line 35
        // or, line 38
        lab2: do {
          v_3 = cursor;
          lab3: do {
            // (, line 36
            // [, line 37
            bra = cursor;
            // literal, line 37
            if (!(eq_s(1, "\u00DF"))) {
              break lab3;
            }
            // ], line 37
            ket = cursor;
            // <-, line 37
            slice_from("ss");
            break lab2;
          } while (false);
          cursor = v_3;
          // next, line 38
          if (cursor >= limit) {
            break lab1;
          }
          cursor++;
        } while (false);
        continue replab0;
      } while (false);
      cursor = v_2;
      break replab0;
    }
    cursor = v_1;
    // repeat, line 41
    replab4: while (true) {
      v_4 = cursor;
      lab5: do {
        // goto, line 41
        golab6: while (true) {
          v_5 = cursor;
          lab7: do {
            // (, line 41
            if (!(in_grouping(g_v, 97, 252))) {
              break lab7;
            }
            // [, line 42
            bra = cursor;
            // or, line 42
            lab8: do {
              v_6 = cursor;
              lab9: do {
                // (, line 42
                // literal, line 42
                if (!(eq_s(1, "u"))) {
                  break lab9;
                }
                // ], line 42
                ket = cursor;
                if (!(in_grouping(g_v, 97, 252))) {
                  break lab9;
                }
                // <-, line 42
                slice_from("U");
                break lab8;
              } while (false);
              cursor = v_6;
              // (, line 43
              // literal, line 43
              if (!(eq_s(1, "y"))) {
                break lab7;
              }
              // ], line 43
              ket = cursor;
              if (!(in_grouping(g_v, 97, 252))) {
                break lab7;
              }
              // <-, line 43
              slice_from("Y");
            } while (false);
            cursor = v_5;
            break golab6;
          } while (false);
          cursor = v_5;
          if (cursor >= limit) {
            break lab5;
          }
          cursor++;
        }
        continue replab4;
      } while (false);
      cursor = v_4;
      break replab4;
    }
    return true;
  }

  private boolean r_mark_regions() {

    int v_1;
    // (, line 47
    I_p1 = limit;
    I_p2 = limit;
    // test, line 52
    v_1 = cursor;
    // (, line 52
    // hop, line 52
    {
      int c = cursor + 3;
      if (0 > c || c > limit) {
        return false;
      }
      cursor = c;
    }
    // setmark x, line 52
    I_x = cursor;
    cursor = v_1;
    // gopast, line 54
    golab0: while (true) {
      lab1: do {
        if (!(in_grouping(g_v, 97, 252))) {
          break lab1;
        }
        break golab0;
      } while (false);
      if (cursor >= limit) {
        return false;
      }
      cursor++;
    }
    // gopast, line 54
    golab2: while (true) {
      lab3: do {
        if (!(out_grouping(g_v, 97, 252))) {
          break lab3;
        }
        break golab2;
      } while (false);
      if (cursor >= limit) {
        return false;
      }
      cursor++;
    }
    // setmark p1, line 54
    I_p1 = cursor;
    // try, line 55
    lab4: do {
      // (, line 55
      if (!(I_p1 < I_x)) {
        break lab4;
      }
      I_p1 = I_x;
    } while (false);
    // gopast, line 56
    golab5: while (true) {
      lab6: do {
        if (!(in_grouping(g_v, 97, 252))) {
          break lab6;
        }
        break golab5;
      } while (false);
      if (cursor >= limit) {
        return false;
      }
      cursor++;
    }
    // gopast, line 56
    golab7: while (true) {
      lab8: do {
        if (!(out_grouping(g_v, 97, 252))) {
          break lab8;
        }
        break golab7;
      } while (false);
      if (cursor >= limit) {
        return false;
      }
      cursor++;
    }
    // setmark p2, line 56
    I_p2 = cursor;
    return true;
  }

  private boolean r_postlude() {

    int among_var;
    int v_1;
    // repeat, line 60
    replab0: while (true) {
      v_1 = cursor;
      lab1: do {
        // (, line 60
        // [, line 62
        bra = cursor;
        // substring, line 62
        among_var = find_among(a_0, 6);
        if (among_var == 0) {
          break lab1;
        }
        // ], line 62
        ket = cursor;
        switch (among_var) {
        case 0:
          break lab1;
        case 1:
          // (, line 63
          // <-, line 63
          slice_from("y");
          break;
        case 2:
          // (, line 64
          // <-, line 64
          slice_from("u");
          break;
        case 3:
          // (, line 65
          // <-, line 65
          slice_from("a");
          break;
        case 4:
          // (, line 66
          // <-, line 66
          slice_from("o");
          break;
        case 5:
          // (, line 67
          // <-, line 67
          slice_from("u");
          break;
        case 6:
          // (, line 68
          // next, line 68
          if (cursor >= limit) {
            break lab1;
          }
          cursor++;
          break;
        }
        continue replab0;
      } while (false);
      cursor = v_1;
      break replab0;
    }
    return true;
  }

  private boolean r_R1() {

    if (!(I_p1 <= cursor)) {
      return false;
    }
    return true;
  }

  private boolean r_R2() {

    if (!(I_p2 <= cursor)) {
      return false;
    }
    return true;
  }

  private boolean r_standard_suffix() {

    int among_var;
    int v_1;
    int v_2;
    int v_3;
    int v_4;
    int v_5;
    int v_6;
    int v_7;
    int v_8;
    int v_9;
    int v_10;
    // (, line 78
    // do, line 79
    v_1 = limit - cursor;
    lab0: do {
      // (, line 79
      // [, line 80
      ket = cursor;
      // substring, line 80
      among_var = find_among_b(a_1, 7);
      if (among_var == 0) {
        break lab0;
      }
      // ], line 80
      bra = cursor;
      // call R1, line 80
      if (!r_R1()) {
        break lab0;
      }
      switch (among_var) {
      case 0:
        break lab0;
      case 1:
        // (, line 82
        // delete, line 82
        slice_del();
        break;
      case 2:
        // (, line 85
        // delete, line 85
        slice_del();
        // try, line 86
        v_2 = limit - cursor;
        lab1: do {
          // (, line 86
          // [, line 86
          ket = cursor;
          // literal, line 86
          if (!(eq_s_b(1, "s"))) {
            cursor = limit - v_2;
            break lab1;
          }
          // ], line 86
          bra = cursor;
          // literal, line 86
          if (!(eq_s_b(3, "nis"))) {
            cursor = limit - v_2;
            break lab1;
          }
          // delete, line 86
          slice_del();
        } while (false);
        break;
      case 3:
        // (, line 89
        if (!(in_grouping_b(g_s_ending, 98, 116))) {
          break lab0;
        }
        // delete, line 89
        slice_del();
        break;
      }
    } while (false);
    cursor = limit - v_1;
    // do, line 93
    v_3 = limit - cursor;
    lab2: do {
      // (, line 93
      // [, line 94
      ket = cursor;
      // substring, line 94
      among_var = find_among_b(a_2, 4);
      if (among_var == 0) {
        break lab2;
      }
      // ], line 94
      bra = cursor;
      // call R1, line 94
      if (!r_R1()) {
        break lab2;
      }
      switch (among_var) {
      case 0:
        break lab2;
      case 1:
        // (, line 96
        // delete, line 96
        slice_del();
        break;
      case 2:
        // (, line 99
        if (!(in_grouping_b(g_st_ending, 98, 116))) {
          break lab2;
        }
        // hop, line 99
        {
          int c = cursor - 3;
          if (limit_backward > c || c > limit) {
            break lab2;
          }
          cursor = c;
        }
        // delete, line 99
        slice_del();
        break;
      }
    } while (false);
    cursor = limit - v_3;
    // do, line 103
    v_4 = limit - cursor;
    lab3: do {
      // (, line 103
      // [, line 104
      ket = cursor;
      // substring, line 104
      among_var = find_among_b(a_4, 8);
      if (among_var == 0) {
        break lab3;
      }
      // ], line 104
      bra = cursor;
      // call R2, line 104
      if (!r_R2()) {
        break lab3;
      }
      switch (among_var) {
      case 0:
        break lab3;
      case 1:
        // (, line 106
        // delete, line 106
        slice_del();
        // try, line 107
        v_5 = limit - cursor;
        lab4: do {
          // (, line 107
          // [, line 107
          ket = cursor;
          // literal, line 107
          if (!(eq_s_b(2, "ig"))) {
            cursor = limit - v_5;
            break lab4;
          }
          // ], line 107
          bra = cursor;
          // not, line 107
          {
            v_6 = limit - cursor;
            lab5: do {
              // literal, line 107
              if (!(eq_s_b(1, "e"))) {
                break lab5;
              }
              cursor = limit - v_5;
              break lab4;
            } while (false);
            cursor = limit - v_6;
          }
          // call R2, line 107
          if (!r_R2()) {
            cursor = limit - v_5;
            break lab4;
          }
          // delete, line 107
          slice_del();
        } while (false);
        break;
      case 2:
      // (, line 110
      // not, line 110
      {
        v_7 = limit - cursor;
        lab6: do {
          // literal, line 110
          if (!(eq_s_b(1, "e"))) {
            break lab6;
          }
          break lab3;
        } while (false);
        cursor = limit - v_7;
      }
        // delete, line 110
        slice_del();
        break;
      case 3:
        // (, line 113
        // delete, line 113
        slice_del();
        // try, line 114
        v_8 = limit - cursor;
        lab7: do {
          // (, line 114
          // [, line 115
          ket = cursor;
          // or, line 115
          lab8: do {
            v_9 = limit - cursor;
            lab9: do {
              // literal, line 115
              if (!(eq_s_b(2, "er"))) {
                break lab9;
              }
              break lab8;
            } while (false);
            cursor = limit - v_9;
            // literal, line 115
            if (!(eq_s_b(2, "en"))) {
              cursor = limit - v_8;
              break lab7;
            }
          } while (false);
          // ], line 115
          bra = cursor;
          // call R1, line 115
          if (!r_R1()) {
            cursor = limit - v_8;
            break lab7;
          }
          // delete, line 115
          slice_del();
        } while (false);
        break;
      case 4:
        // (, line 119
        // delete, line 119
        slice_del();
        // try, line 120
        v_10 = limit - cursor;
        lab10: do {
          // (, line 120
          // [, line 121
          ket = cursor;
          // substring, line 121
          among_var = find_among_b(a_3, 2);
          if (among_var == 0) {
            cursor = limit - v_10;
            break lab10;
          }
          // ], line 121
          bra = cursor;
          // call R2, line 121
          if (!r_R2()) {
            cursor = limit - v_10;
            break lab10;
          }
          switch (among_var) {
          case 0:
            cursor = limit - v_10;
            break lab10;
          case 1:
            // (, line 123
            // delete, line 123
            slice_del();
            break;
          }
        } while (false);
        break;
      }
    } while (false);
    cursor = limit - v_4;
    return true;
  }

  public boolean stem() {

    int v_1;
    int v_2;
    int v_3;
    int v_4;
    // (, line 133
    // do, line 134
    v_1 = cursor;
    lab0: do {
      // call prelude, line 134
      if (!r_prelude()) {
        break lab0;
      }
    } while (false);
    cursor = v_1;
    // do, line 135
    v_2 = cursor;
    lab1: do {
      // call mark_regions, line 135
      if (!r_mark_regions()) {
        break lab1;
      }
    } while (false);
    cursor = v_2;
    // backwards, line 136
    limit_backward = cursor;
    cursor = limit;
    // do, line 137
    v_3 = limit - cursor;
    lab2: do {
      // call standard_suffix, line 137
      if (!r_standard_suffix()) {
        break lab2;
      }
    } while (false);
    cursor = limit - v_3;
    cursor = limit_backward; // do, line 138
    v_4 = cursor;
    lab3: do {
      // call postlude, line 138
      if (!r_postlude()) {
        break lab3;
      }
    } while (false);
    cursor = v_4;
    return true;
  }

  public boolean equals(Object o) {

    return o instanceof germanStemmer;
  }

  public int hashCode() {

    return germanStemmer.class.getName().hashCode();
  }

}

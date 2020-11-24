/*
 * Problem 336
 * 
 * A train is used to transport four carriages in the order: ABCD. However,
 * sometimes when the train arrives to collect the carriages they are not in the
 * correct order. To rearrange the carriages they are all shunted on to a large
 * rotating turntable. After the carriages are uncoupled at a specific point the
 * train moves off the turntable pulling the carriages still attached with it.
 * The remaining carriages are rotated 180 degrees. All of the carriages are
 * then rejoined and this process is repeated as often as necessary in order to
 * obtain the least number of uses of the turntable. Some arrangements, such as
 * ADCB, can be solved easily: the carriages are separated between A and D, and
 * after DCB are rotated the correct order has been achieved.
 * 
 * However, Simple Simon, the train driver, is not known for his efficiency, so
 * he always solves the problem by initially getting carriage A in the correct
 * place, then carriage B, and so on. Using four carriages, the worst possible
 * arrangements for Simon, which we shall call maximix arrangements, are DACB
 * and DBAC; each requiring him five rotations (although, using the most
 * efficient approach, they could be solved using just three rotations). The
 * process he uses for DACB is shown below.
 * 
 * It can be verified that there are 24 maximix arrangements for six carriages,
 * of which the tenth lexicographic maximix arrangement is DFAECB.
 * 
 * Find the 2011th lexicographic maximix arrangement for eleven carriages.
 * 
 * 
 * PERSONAL NOTES
 * 
 * 4-cars, 5 rotations 
 * T_D_/A_C_B 1 
 * T_/D_C_C_A 2 
 * T_A_C_/B_D 3 
 * T_A_/C_D_B 4
 * T_A_B_/D_C 5 
 * T_A_B_C_D
 * 
 * 6-cars predict 9 rotations 
 * t_D_F_/A_E_C_B 1 
 * t_/D_F_B_C_E_A 2 
 * t_A_E_C_/B_F_D 3
 * t_A_/E_C_D_F_B 4 
 * t_A_B_F_D_/C_E 5 
 * t_A_B_/F_D_E_C 6 
 * t_A_B_C_E_/D_F 7
 * t_A_B_C_/E_F_D 8 
 * t_A_B_C_D_/F_E 9 
 * t_A_B_C_D_E_F
 * 
 * r = number of rotations for maximix arrangement n = number of cars r = 2(n -
 * 2) + 1
 * 
 * not sure if this helps, but i might have figured out the number of rotations
 * needed for maximix arrangements (at least for even numbers of cars). this is
 * because each letter should require 2 rotations, except the last two numbers
 * only require 1 rotation.
 * 
 * so if there are 6 cars, the first 4 cars require 2 rotations each (8 turns)
 * the last two cars only require 1 rotation to get both of them (9 total).
 * 
 * if this holds true for larger numbers, and odd numbers, this might help
 * solve. r = 2(11-2)+1 = 19 rotations.
 * 
 * also, half of the rotations will always be in the same place. this is because
 * the drive must detach to retrieve 'a', then detach somewhere unknown, then
 * detach to retrieve 'b'. the number of permutations if lexicographically
 * miximized arrangements is determined by those unknown lines.
 * 
 * unknown 1 'a' 2 unknown 3 'b' 4 unknown 5 'c' 6 unknown 7 'd' 8 unknown 9 'e'
 * 10 unknown 11 'f' 12 unknown 13 'g' 14 unknown 15 'h' 16 unknown 17 'i' 18
 * 'j' + 'k' 19
 * 
 * there are 9 unknown lines. 9! is 362880. there may be unknown lines = n - 2
 * it is given there are 24 maximix arrangements of 6 cars n - 2 = 4 4! = 24
 * 
 * i believe there are 362880 maximix arrangements. when placed alphabetically,
 * the site is asking for the 2011th
 * 
 * the problem has how become: sort these 362880 arrays, and print the 2011th
 * one
 * 
 * 
 * 
 * ans = ;
 */

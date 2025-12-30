package com.github.radu88253.cobolparser.lexer;

import com.github.radu88253.cobolparser.psi.CobolTokenType;import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;
import com.github.radu88253.cobolparser.psi.CobolTypes;

%%

%class CobolLexer
%public
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{
    return;
%eof}

CRLF=\r?\n
WHITE_SPACE=[\ \t\f]+

%%

"IDENTIFICATION"                                             {return CobolTypes.KEYWORD;}
"DIVISION"                                                   {return CobolTypes.KEYWORD;}
"PROGRAM-ID"                                                 {return CobolTypes.KEYWORD;}
"DATA"                                                       {return CobolTypes.KEYWORD;}
"WORKING-STORAGE"                                            {return CobolTypes.KEYWORD;}
"SECTION"                                                    {return CobolTypes.KEYWORD;}
"PIC"                                                        {return CobolTypes.KEYWORD;}
"VALUE"                                                      {return CobolTypes.KEYWORD;}
"PROCEDURE"                                                  {return CobolTypes.KEYWORD;}
"PERFORM"                                                    {return CobolTypes.KEYWORD;}
"VARYING"                                                    {return CobolTypes.KEYWORD;}
"FROM"                                                       {return CobolTypes.KEYWORD;}
"BY"                                                         {return CobolTypes.KEYWORD;}
"UNTIL"                                                      {return CobolTypes.KEYWORD;}
"STOP"                                                       {return CobolTypes.KEYWORD;}
"RUN"                                                        {return CobolTypes.KEYWORD;}
"DISPLAY"                                                    {return CobolTypes.KEYWORD;}

'([^']|'')*'                                                 {return CobolTypes.STRING;}
[A-Z]([A-Z0-9-]*[A-Z0-9])?                                   {return CobolTypes.IDENTIFIER;}
^([0-9]{1,6})[\ \t]                                          {return CobolTypes.LINE_NUMBER;}
[0-9]+                                                       {return CobolTypes.NUMBER;}
[*-+/=]                                                      {return CobolTypes.OPERATOR;}
"("                                                          {return CobolTypes.LPAREN;}
")"                                                          {return CobolTypes.RPAREN;}
{WHITE_SPACE}*{CRLF}{WHITE_SPACE}*                           {return CobolTypes.CRLF;}
{WHITE_SPACE}+                                               { /* skip */ }
"."                                                          {return CobolTypes.DOT;}
.                                                            {return TokenType.BAD_CHARACTER;}
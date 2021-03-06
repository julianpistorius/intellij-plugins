// This is a generated file. Not intended for manual editing.
package com.jetbrains.lang.dart.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DartNamedConstructorDeclaration extends DartComponent {

  @NotNull
  DartComponentName getComponentName();

  @NotNull
  List<DartExpression> getExpressionList();

  @NotNull
  DartFormalParameterList getFormalParameterList();

  @Nullable
  DartFunctionBody getFunctionBody();

  @Nullable
  DartInitializers getInitializers();

  @Nullable
  DartRedirection getRedirection();

}

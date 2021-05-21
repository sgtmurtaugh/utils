package de.ckraus.webcommons.mapper.servlet.filter;

import de.ckraus.webcommons.mapper.ScopeMapper;

import javax.servlet.Filter;

public interface ScopeTypeMapperFilter<E> extends ScopeMapper<E>, Filter {
}
